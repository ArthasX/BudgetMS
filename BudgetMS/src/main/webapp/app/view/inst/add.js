Ext.define('BudgetMS.view.inst.add', {
	extend : 'Ext.window.Window',
	alias : 'widget.instAdd',
	title : '请示新增',
	layout : 'fit',
	autoShow : true,
	initComponent : function() {
		this.items = instAddItems;
		this.buttons = [ {
			text : '增加',
			action : 'doAddInst'
			}
		, {
			text : '取消',
			scope : this,
			handler : this.close
		} ]

		this.callParent(arguments);
	}
});

var instAddItems = [ {
	xtype : 'form',
	layout : 'auto',
	items : [ {
		xtype : 'textfield',
		name : 'instId',
		fieldLabel : '请示编号',
		value:genInstId()
	}, {
		xtype : 'textfield',
		name : 'instTitle',
		fieldLabel : '请示标题'
	}, {
		xtype : 'textarea',
		name : 'instContent',
		fieldLabel : '请示内容'
	}, {
		xtype : 'combo',
		name : 'instType',
		fieldLabel : '请示类型',
		valueField : 'typeId',
		displayField : 'typeName',
		store : {
			fields : [ 'typeId', 'typeName' ],
			data : [ {
				"typeId" : "0",
				"typeName" : "一般请示"
			}, {
				"typeId" : "1",
				"typeName" : "IT服务申请表"
			} ]
		}
	}, {
		xtype : 'combo',
		name : 'applyDept',
		fieldLabel : '申请部门',
		valueField : 'deptId',
		displayField : 'deptName',
		store : {
			fields : [ 'deptId', 'deptName' ],
			data : [ {
				"deptId" : "0",
				"deptName" : "电子银行"
			}, {
				"deptId" : "1",
				"deptName" : "科技管理"
			}, {
				"deptId" : "6",
				"deptName" : "科技开发"
			} ]
		}
	}, {
		xtype : 'textfield',
		name : 'instAmt',
		fieldLabel : '请示金额',
		vtype : 'money'
	}, {
		xtype : 'textfield',
		name : 'softAmt',
		fieldLabel : '软件金额',
		vtype : 'money'
	}, {
		xtype : 'textfield',
		name : 'hardAmt',
		fieldLabel : '硬件金额',
		vtype : 'money'
	}, {
		xtype : 'textfield',
		name : 'applyUserName',
		fieldLabel : '申请人'
	}, {
		xtype : 'textfield',
		name : 'remark',
		fieldLabel : '备注'
	} ]
// 上传文件的组件
} ];