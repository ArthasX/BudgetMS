Ext.define('BudgetMS.view.inst.baseInstWin', {
	extend : 'Ext.window.Window',
	name : 'inst',
	layout : {
		type : 'hbox',
		align : 'stretch'
	},
	height : 500,
	width : 800,
	autoShow : true,
	initComponent : function() {
		// debugger;
		this.items = instFormItems;
		this.callParent(arguments);
		var form = this.items.items[0].getForm();
		var applyDeptCombo = form.findField('applyDept');
		deptMemoryStore.data = deptStore.data;
		// Ext.apply(combo.store,deptMemoryStore);
		applyDeptCombo.bindStore(deptMemoryStore);
////		 决定不用缓存
//		 typeInfoMemoryStore.data=typeInfoStore.data;debugger;
//		 var typeInfoCombo =form.findField('instType');
//		 typeInfoCombo.bindStore(typeInfoMemoryStore);

	}
});

var instFormItems = [ {
	flex : 1,
	xtype : 'form',
	layout : 'auto',
	items : [ {
		xtype : 'textfield',
		name : 'instId',
		fieldLabel : '请示编号'
	}, {
		xtype : 'textfield',
		name : 'instTitle',
		fieldLabel : '请示标题'
	}, {
		xtype : 'textarea',
		name : 'instContent',
		fieldLabel : '请示内容'
	}, {
		// xtype : 'combo',
		// name : 'instType',
		// fieldLabel : '请示类型',
		// valueField : 'typeId',
		// displayField : 'typeName',
		// store : {
		// fields : [ 'typeId', 'typeName' ],
		// data : [ {
		// "typeId" : "1",
		// "typeName" : "一般请示"
		// }, {
		// "typeId" : "2",
		// "typeName" : "IT服务申请表"
		// } ]
		// }
		xtype : 'typeInfoCombo',
		name : 'instType',
		category:'inst',
		fieldLabel : '请示类型'
	}, {
		xtype : 'combo',
		name : 'instStatus',
		fieldLabel : '请示状态',
		valueField : 'typeId',
		displayField : 'typeName',
		store : {
			fields : [ 'typeId', 'typeName' ],
			data : [ {
				"typeId" : "在途",
				"typeName" : "在途"
			}, {
				"typeId" : "审批结束",
				"typeName" : "审批结束"
			} ]
		}
	}, {
		// xtype : 'combo',
		// name : 'applyDept',
		// fieldLabel : '申请部门',
		// valueField : 'deptId',
		// displayField : 'deptName',
		// allowBlank : false,
		// store : {
		// fields : [ 'deptId', 'deptName' ],
		// data : [ {
		// "deptId" : "1",
		// "deptName" : "电子银行"
		// }, {
		// "deptId" : "2",
		// "deptName" : "科技管理"
		// }, {
		// "deptId" : "3",
		// "deptName" : "科技开发"
		// } ]
		// }
		xtype : 'deptCombo',
		name : 'applyDept'
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
} // 上传文件的组件
, {
	flex : 1,
	xtype : 'baseFileGrid',
	name : 'inst'
} ];