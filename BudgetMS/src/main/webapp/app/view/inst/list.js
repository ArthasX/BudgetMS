/**
 * 请示表头
 * 
 */
var instColum = [ {
	xtype : 'checkcolumn',
	text : '选中',
	dataIndex : 'active'
}, {
	header : '请示编号',
	dataIndex : 'instId',

}, {
	header : '请示标题',
	dataIndex : 'instTitle',

}, {
	header : '请示内容',
	dataIndex : 'instContent',

}, {
	header : '请示类型',
	dataIndex : 'instType',

}, {
	header : '申请部门',
	dataIndex : 'applyDept',

}, {
	header : '请示金额',
	dataIndex : 'instAmt',

}, {
	header : '软件金额',
	dataIndex : 'softAmt',

}, {
	header : '硬件金额',
	dataIndex : 'hardAmt',

},
// {
// header : '申请人',
// dataIndex : 'applyUser',
//	
// },
{
	header : '申请人',
	dataIndex : 'applyUserName',

}, {
	header : '操作时间',
	dataIndex : 'optDate',

}, {
	header : '操作人',
	dataIndex : 'optUser',

}, {
	header : '备注',
	dataIndex : 'remark',

}, {

} ];

/**
 * 分页工具栏
 */

//var pagingToolbar = Ext.create('Ext.PagingToolbar', {
//	store : 'instStore',
//	displayInfo : true,
//	displayMsg : 'Displaying topics {0} - {1} of {2}',
//	emptyMsg : "No topics to display",
//	items : [ '-', {
//		text : 'Show Preview',
//		pressed : true,
//		enableToggle : true,
//		toggleHandler : function(btn, pressed) {
//			//var preview = Ext.getCmp('gv').getPlugin('preview');
//			//preview.toggleExpanded(pressed);
//		}
//	} ]
//});

Ext.define('BudgetMS.view.inst.list', {
	extend : 'Ext.grid.Panel',
	alias : 'widget.instlist',
	store : 'instStore',
	title : 'All instrctions',

	initComponent : function() {

		this.columns = instColum;

		this.callParent(arguments);
		//this.bbar = pagingToolbar;
	}
});